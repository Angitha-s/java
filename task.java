class Task {
    public static void main(String args[]) {
        int a[] = new int[6];
        a[0] = 90;
        a[1] = 70;
        a[2] = 40;
        a[3] = 54;
        a[4] = 75;
        a[5] = 50;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 90) {
                System.out.println("Excellent");
            } else if (a[i] >= 75 && a[i] <= 89) {
                System.out.println("Good");
            } else if (a[i] >= 50 && a[i] <= 74) {
                System.out.println("Average");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
