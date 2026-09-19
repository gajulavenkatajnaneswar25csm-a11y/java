class ReverseString {
    public static void main(String[] args) {
        String text = "madam";
        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println(reversed);
    }
}