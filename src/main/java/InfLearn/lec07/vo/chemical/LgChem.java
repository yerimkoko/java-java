package InfLearn.lec07.vo.chemical;

/**
 * 엘지 화학
 */
public class LgChem {
    private static LgChem LgChem = new LgChem();

    private LgChem() {

    }

    public static LgChem getInstance() {
        return LgChem;
    }


    private int salesAmount;    // 매출액
    private int propertyAmount; // 자산액
    private int debtAmount;     // 부채액
    private int totalEmployee;  // 총 종업원
    private String headOfficeAddress; // 본점주소
    private String companyProperty;    // 회사 속성 (조선, it, 화학, 전자)
    private String company;            // 회사명
    private int capitalAmount;

    @Override
    public String toString() {
        return "LgChem{" +
                "salesAmount=" + salesAmount +
                ", propertyAmount=" + propertyAmount +
                ", debtAmount=" + debtAmount +
                ", totalEmployee=" + totalEmployee +
                ", capitalAmount=" + capitalAmount +
                ", headOfficeAddress='" + headOfficeAddress + '\'' +
                ", companyProperty='" + companyProperty + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public int getCapitalAmount() {
        return capitalAmount;
    }

    public void setCapitalAmount(int propertyAmount, int debtAmount) {
        this.capitalAmount = this.propertyAmount - this.debtAmount;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }

    public int getPropertyAmount() {
        return propertyAmount;
    }

    public void setPropertyAmount(int propertyAmount) {
        this.propertyAmount = propertyAmount;
    }

    public int getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(int debtAmount) {
        this.debtAmount = debtAmount;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    public void setTotalEmployee(int totalEmployee) {
        this.totalEmployee = totalEmployee;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getCompanyProperty() {
        return companyProperty;
    }

    public void setCompanyProperty(String companyProperty) {
        this.companyProperty = companyProperty;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
