package Account;

public class AccountDetails {

    String customerName;
    String emailAddress;
    int amount;
    int accNo;
    double phoneNo;


    public AccountDetails() {
    }

    public AccountDetails(String customerName, String emailAddress, int amount, int accNo, double phoneNo) {
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.amount = amount;
        this.accNo = accNo;
        this.phoneNo = phoneNo;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setPhoneNo(double phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getAmount() {
        return amount;
    }

    public int getAccNo() {
        return accNo;
    }

    public double getPhoneNo() {
        return phoneNo;
    }
}
