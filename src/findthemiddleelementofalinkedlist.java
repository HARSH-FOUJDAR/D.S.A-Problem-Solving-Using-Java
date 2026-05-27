class findthemiddleelementofalinkedlist {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print(findmiddle(arr));

    }

    public static int findmiddle(int[] arr) {
        int slow = 0;
        int fast = 0;
        while (arr.length - 1 > slow && arr.length - 1 > fast) {
            slow = slow + 1;
            fast = fast + 2;

        }
        return arr[slow];
    }
}
