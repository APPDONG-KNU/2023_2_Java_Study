package baekjun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    public TreeNode(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}
//백준 2221번이에용 오타 ㅠㅠ

public class prob2211 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 노드의 갯수 입력
        int N = scanner.nextInt();

        TreeNode[] nodes = new TreeNode[N];

        // 트리 구성
        for (int i = 0; i < N; i++) {
            int parentIndex = scanner.nextInt()-1;

            if (parentIndex == -2) {
                nodes[i] = new TreeNode(i);
            } else {
                if (nodes[parentIndex] == null) {
                    nodes[parentIndex] = new TreeNode(parentIndex);
                }
                TreeNode child = new TreeNode(i);
                nodes[parentIndex].children.add(child);
                nodes[i] = child;
            }
        }

        // 레벨의 갯수 계산
        int maxLevel = 0;

        // 레벨별 노드 개수를 저장하는 배열
        int[] levelNodeCount = new int[N];

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(nodes[0]);  // 최상단 노드부터 시작

        while (!queue.isEmpty()) {
            int size = queue.size();
            maxLevel++;

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                levelNodeCount[maxLevel - 1]++; // 현재 노드의 레벨에 개수를 증가


                for (TreeNode child : current.children) {
                    queue.add(child);
                }
            }
        }

        // 결과 출력
        System.out.println(maxLevel);

        // 가장 노드가 많은 레벨과 그 레벨의 노드 수
        int maxLevelNodeCount = 0;
        int maxnodelevel = 0;
        
        for (int i = 0; i < maxLevel; i++) {
            if (levelNodeCount[i] > maxLevelNodeCount) {
                maxLevelNodeCount = levelNodeCount[i];
                maxnodelevel=i;
            }
        }
        
        // 가장 노드가 많은 레벨과 그 아래 레벨의 노드의 합을 레벨의 갯수로 나눠 근로자 수 구하기
        int sum=0;
        for (int i = maxnodelevel; i<maxLevel;i++) {
        	sum=sum+levelNodeCount[i]; 	       	
        }
        
        double worker = Math.ceil((double)sum/(maxLevel-maxnodelevel));
        if (worker<levelNodeCount[maxLevel-1])
        	worker=levelNodeCount[maxLevel-1];
        for (int i=0; i < maxnodelevel;i++ )
        	worker=Math.max(worker,levelNodeCount[i]);
        	
        	
        System.out.println(N-(int) worker);
        scanner.close();
	}
}
