public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.print("Enter number of cookies: ");
int num = in.nextInt();
double discount;
if (num > 6) {
discount = 0.05;
} else if (num > 12) {
discount = 0.10;
}
System.out.println("Discount = " + discount);  
}

