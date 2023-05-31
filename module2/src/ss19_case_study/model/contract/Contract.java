package ss19_case_study.model.contract;

public class Contract {
    private String contractCode;
    private String bookingCode;
    private float depositAdvance;
    private float totalPaymentAmount;

    public Contract(String contractCode, String bookingCode, float depositAdvance, float totalPaymentAmount) {
        this.contractCode = contractCode;
        this.bookingCode = bookingCode;
        this.depositAdvance = depositAdvance;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public float getDepositAdvance() {
        return depositAdvance;
    }

    public void setDepositAdvance(float depositAdvance) {
        this.depositAdvance = depositAdvance;
    }

    public float getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(float totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractCode='" + contractCode + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", depositAdvance=" + depositAdvance +
                ", totalPaymentAmount=" + totalPaymentAmount +
                '}';
    }
}
