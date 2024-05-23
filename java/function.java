public class function {
    public static int sum(int a, int b){
        int ans= a+b;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println(sum(a,b));
    }
}
