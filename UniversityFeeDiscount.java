class UniversityFeeDiscount {
    public static void main(String[] args) {
        double fee = 125000, discountPercent = 10;
        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}