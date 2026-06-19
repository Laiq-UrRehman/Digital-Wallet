class SecurityUtility {
    public static boolean isHighValue(double amount) {
        if (amount > 25000) {
            return true;
        } else {
            return false;
        }
    }

    public static String generateOTP() {
        String numbers = "0123456789";
        String otp = "";
        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * numbers.length());
            otp += numbers.charAt(index);
        }
        return otp;
    }

    public static boolean validateOTP(String inputOTP, String generatedOTP) {
        return inputOTP.equals(generatedOTP);
    }
}