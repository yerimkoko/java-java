package InfLearn.lec07.main;

import InfLearn.lec07.vo.chemical.Hcc;
import InfLearn.lec07.vo.chemical.LgChem;
import InfLearn.lec07.vo.chemical.LotteChemical;
import InfLearn.lec07.vo.elecronics.LgElectronics;
import InfLearn.lec07.vo.elecronics.SKHynix;
import InfLearn.lec07.vo.elecronics.SamsungElectronics;

public class MainMethod {
    public static void main(String[] args) {
        // 기업정보 셋팅
        // 한화솔루션 케미칼
        Hcc hcc = Hcc.getInstance(); // 생성된 객체를 정적으로 끌고 오는 것이다.
        String hccName = String.valueOf("한화솔루션케미칼"); // String.valueOf => null값이면 null을 담아서 넣어준다.
        String hccCompanyProperty = String.valueOf("화학");
        String hccHeadOfficeAddress = String.valueOf("서울특별시 중구 청계천로 86 한화빌딩");
        int hccTotalEmployee = 5730;
        int hccSalesAmount = 34493;
        int hccPropertyAmount = 82446;
        int hccDebtAmount = 32289;

        hcc.setCompany(hccName); // private으로 선언이 되어있으므로.. set으로 설정함. setter 에
        hcc.setCompanyProperty(hccCompanyProperty);
        hcc.setHeadOfficeAddress(hccHeadOfficeAddress);
        hcc.setTotalEmployee(hccTotalEmployee);
        hcc.setSalesAmount(hccSalesAmount);
        hcc.setPropertyAmount(hccPropertyAmount);
        hcc.setCapitalAmount(hccPropertyAmount, hccDebtAmount);

        // 엘지화학
        LgChem lgChem = LgChem.getInstance(); // 생성된 객체를 정적으로 끌고 오는 것이다.
        String lgChemName = String.valueOf("LG화학"); // String.valueOf => null값이면 null을 담아서 넣어준다.
        String lgChemCompanyProperty = String.valueOf("화학");
        String lgChemHeadOfficeAddress = String.valueOf("서울 영등포구 여의대로 128");
        int lgChemTotalEmployee = 20073;
        int lgChemSalesAmount = 286250;
        int lgChemPropertyAmount = 340244;
        int lgChemDebtAmount = 166406;

        lgChem.setCompany(lgChemName); // private으로 선언이 되어있으므로.. set으로 설정함.
        lgChem.setCompanyProperty(lgChemCompanyProperty);
        lgChem.setHeadOfficeAddress(lgChemHeadOfficeAddress);
        lgChem.setTotalEmployee(lgChemTotalEmployee);
        lgChem.setSalesAmount(lgChemSalesAmount);
        lgChem.setPropertyAmount(lgChemPropertyAmount);
        lgChem.setCapitalAmount(lgChemPropertyAmount, lgChemDebtAmount);

        // 롯데케미컬
        LotteChemical lotteChemical = LotteChemical.getInstance(); // 생성된 객체를 정적으로 끌고 오는 것이다.
        String lotteChemicalName = String.valueOf("롯데케미칼"); // String.valueOf => null값이면 null을 담아서 넣어준다.
        String lotteChemicalCompanyProperty = String.valueOf("화학");
        String lotteChemicalHeadOfficeAddress = String.valueOf("서울특별시 송파구 올림픽로 300, 롯데월드타워 14F~16F");
        int lotteChemicalTotalEmployee = 4540;
        int lotteChemicalSalesAmount = 200431;
        int lotteChemicalPropertyAmount = 200431;
        int lotteChemicalDebtAmount = 59899;

        lotteChemical.setCompany(lotteChemicalName); // private으로 선언이 되어있으므로.. set으로 설정함.
        lotteChemical.setCompanyProperty(lotteChemicalCompanyProperty);
        lotteChemical.setHeadOfficeAddress(lotteChemicalHeadOfficeAddress);
        lotteChemical.setTotalEmployee(lotteChemicalTotalEmployee);
        lotteChemical.setSalesAmount(lotteChemicalSalesAmount);
        lotteChemical.setPropertyAmount(lotteChemicalPropertyAmount);
        lotteChemical.setCapitalAmount(lotteChemicalPropertyAmount, lotteChemicalDebtAmount);

        // lg전자
        LgElectronics lgElectronics = LgElectronics.getInstance(); // 생성된 객체를 정적으로 끌고 오는 것이다.
        String lgElectronicsName = String.valueOf("엘지전자");
        String lgElectronicsCompanyProperty = String.valueOf("전자");
        String lgElectronicsHeadOfficeAddress = String.valueOf("서울시 영등포구 여의대로 128 lg트윈타워");
        int lgElectronicsTotalEmployee = 39765;
        int lgElectronicsSalesAmount = 286544;
        int lgElectronicsPropertyAmount = 44598;
        int lgElectronicsDebtAmount = 24343;

        lgElectronics.setCompany(lgElectronicsName); // private으로 선언이 되어있으므로.. set으로 설정함.
        lgElectronics.setCompanyProperty(lgElectronicsCompanyProperty);
        lgElectronics.setHeadOfficeAddress(lgElectronicsHeadOfficeAddress);
        lgElectronics.setTotalEmployee(lgElectronicsTotalEmployee);
        lgElectronics.setSalesAmount(lgElectronicsSalesAmount);
        lgElectronics.setPropertyAmount(lgElectronicsPropertyAmount);
        lgElectronics.setCapitalAmount(lgElectronicsPropertyAmount, lgElectronicsDebtAmount);

        // 삼성전자
        SamsungElectronics samsungElectronics = SamsungElectronics.getInstance(); // 생성된 객체를 정적으로 끌고 오는 것이다.
        String samsungElectronicsName = String.valueOf("삼성전자");
        String samsungElectronicsCompanyProperty = String.valueOf("전자");
        String samsungElectronicsHeadOfficeAddress = String.valueOf("경기도 수원시 영통구 삼성로 129");
        int samsungElectronicsTotalEmployee = 106461;
        int samsungElectronicsSalesAmount = 1547000;
        int samsungElectronicsPropertyAmount = 3017521;
        int samsungElectronicsDebtAmount = 872607;

        samsungElectronics.setCompany(samsungElectronicsName); // private으로 선언이 되어있으므로.. set으로 설정함.
        samsungElectronics.setCompanyProperty(samsungElectronicsCompanyProperty);
        samsungElectronics.setHeadOfficeAddress(samsungElectronicsHeadOfficeAddress);
        samsungElectronics.setTotalEmployee(samsungElectronicsTotalEmployee);
        samsungElectronics.setSalesAmount(samsungElectronicsSalesAmount);
        samsungElectronics.setPropertyAmount(samsungElectronicsPropertyAmount);
        samsungElectronics.setCapitalAmount(samsungElectronicsPropertyAmount, samsungElectronicsDebtAmount);


        // sk하이닉스
        SKHynix skHynix = SKHynix.getInstance();
        String skhName = String.valueOf("SK하이닉스");
        String skhProp = String.valueOf("전자");
        String skhAddress = String.valueOf("경기도 이천시 부달읍 경정대로 2091");
        int skhTotalEmployee = 28482;
        int skhSalesAmount = 253000;
        int skhPropertyAmount = 322160;
        int skhDeptAmount = 168462;

        skHynix.setCompany(skhName);
        skHynix.setCompanyProperty(skhProp);
        skHynix.setHeadOfficeAddress(skhAddress);
        skHynix.setTotalEmployee(skhTotalEmployee);
        skHynix.setSalesAmount(skhSalesAmount);
        skHynix.setPropertyAmount(skhPropertyAmount);
        skHynix.setDebtAmount(skhDeptAmount);
        skHynix.setCapitalAmount(skhSalesAmount, skhDeptAmount);

        // 다 불러오는 코드!!!!!
        System.out.println(hcc.toString());
        System.out.println(lgChem.toString());
        System.out.println(lotteChemical.toString());
        System.out.println(lgElectronics.toString());
        System.out.println(samsungElectronics.toString());
        System.out.println(skHynix.toString());

    }
}
