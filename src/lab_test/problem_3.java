
package lab_test;

public class problem_3 {
    public static void main(String[] args) {
        int n=100;
        int sqSum=0;
        int sumSq=0;
        for (int i=1;i<=n;i++){
            sqSum=sqSum + i*i;
        }
        for (int i=1;i<=n;i++){
            sumSq=sumSq+i;
        }
        sumSq=sumSq*sumSq;
        System.out.println(sumSq-sqSum);
    }
}
