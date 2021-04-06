package InfLearn.lec08.machine;

import InfLearn.lec07.vo.chemical.Hcc;
import InfLearn.lec07.vo.chemical.LgChem;
import InfLearn.lec07.vo.chemical.LotteChemical;
import InfLearn.lec07.vo.elecronics.LgElectronics;
import InfLearn.lec07.vo.elecronics.SKHynix;
import InfLearn.lec07.vo.elecronics.SamsungElectronics;

public class SetInfo {

    public Hcc hcc                             = Hcc.getInstance();
    public LgChem lgChem                       = LgChem.getInstance();
    public LotteChemical lotteChemical         = LotteChemical.getInstance();
    public LgElectronics lgElectronics         = LgElectronics.getInstance();
    public SamsungElectronics samsungElectronics          = SamsungElectronics.getInstance();
    public SKHynix skhynix                     = SKHynix.getInstance();

    public void setCompanyInfo() {
        // 기업정보 셋팅
        // 한화솔루션케미칼
        String hccName                  = String.valueOf("한화솔루션케미칼");
        String hccCompanyProperty       = String.valueOf("화학");
        String hccHeadOfficeAddress     = String.valueOf("서울특별시 중구 청계천로 86 한화빌딩");
        int hccTotalEmployee            = 5730;
        int hccSalesAmount              = 34493;
        int hccPropertyAmount           = 82446;
        int hccDebtAmount               = 32289;

        hcc.setCompany(hccName);
        hcc.setCompanyProperty(hccCompanyProperty);
        hcc.setHeadOfficeAddress(hccHeadOfficeAddress);
        hcc.setTotalEmployee(hccTotalEmployee);
        hcc.setSalesAmount(hccSalesAmount);
        hcc.setPropertyAmount(hccPropertyAmount);
        hcc.setDebtAmount(hccDebtAmount);
        hcc.setCapitalAmount(hccPropertyAmount, hccDebtAmount);

        // 엘지화학
        String lgChemName                  = String.valueOf("LG화학");
        String lgChemCompanyProperty       = String.valueOf("화학");
        String lgChemHeadOfficeAddress     = String.valueOf("서울 영등포구 여의대로 128");
        int lgChemTotalEmployee            = 20073;
        int lgChemSalesAmount              = 286250;
        int lgChemPropertyAmount           = 340244;
        int lgChemDebtAmount               = 166406;

        lgChem.setCompany(lgChemName);
        lgChem.setCompanyProperty(lgChemCompanyProperty);
        lgChem.setHeadOfficeAddress(lgChemHeadOfficeAddress);
        lgChem.setTotalEmployee(lgChemTotalEmployee);
        lgChem.setSalesAmount(lgChemSalesAmount);
        lgChem.setPropertyAmount(lgChemPropertyAmount);
        lgChem.setDebtAmount(lgChemDebtAmount);
        lgChem.setCapitalAmount(lgChemPropertyAmount, lgChemDebtAmount);

        // 롯데케미칼
        String lochemName                   = String.valueOf("롯데케미칼");
        String lochemCompanyProperty        = String.valueOf("화학");
        String lochemHeadOfficeAddress      = String.valueOf("서울특별시 송파구 올림픽로 300, 롯데월드타워 14F~16F");
        int lochemTotalEmployee             = 4540;
        int lochemSalesAmount               = 151234;
        int lochemPropertyAmount            = 200431;
        int lochemDebtAmount                = 59899;

        lotteChemical.setCompany(lochemName);
        lotteChemical.setCompanyProperty(lochemCompanyProperty);
        lotteChemical.setHeadOfficeAddress(lochemHeadOfficeAddress);
        lotteChemical.setTotalEmployee(lochemTotalEmployee);
        lotteChemical.setSalesAmount(lochemSalesAmount);
        lotteChemical.setPropertyAmount(lochemPropertyAmount);
        lotteChemical.setDebtAmount(lochemDebtAmount);
        lotteChemical.setCapitalAmount(lochemPropertyAmount, lochemDebtAmount);

        // 엘지전자
        String lgEName                      = String.valueOf("LG전자");
        String lgEProp                      = String.valueOf("전자");
        String lgEAddress                   = String.valueOf("서울시 영등포구 여의대로 128 LG트윈타워");
        int lgETotalEmployee                = 39765;
        int lgESalesAmount                  = 286544;
        int lgEPropertyAmount               = 448598;
        int lgEDebtAmount                   = 284347;

        lgElectronics.setCompany(lgEName);
        lgElectronics.setCompanyProperty(lgEProp);
        lgElectronics.setHeadOfficeAddress(lgEAddress);
        lgElectronics.setTotalEmployee(lgETotalEmployee);
        lgElectronics.setSalesAmount(lgESalesAmount);
        lgElectronics.setPropertyAmount(lgEPropertyAmount);
        lgElectronics.setDebtAmount(lgEDebtAmount);
        lgElectronics.setCapitalAmount(lgEPropertyAmount, lgEDebtAmount);

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
        String skhName                      = String.valueOf("SK하이닉스");
        String skhProp                      = String.valueOf("전자");
        String skhAddress                   = String.valueOf("경기도 이천시 부달읍 경청대로 2091");
        int skhTotalEmployee                = 28482;
        int skhSalesAmount                  = 253000;
        int skhPropertyAmount               = 322160;
        int skhDebtAmount                   = 168462;

        skhynix.setCompany(skhName);
        skhynix.setCompanyProperty(skhProp);
        skhynix.setHeadOfficeAddress(skhAddress);
        skhynix.setTotalEmployee(skhTotalEmployee);
        skhynix.setSalesAmount(skhSalesAmount);
        skhynix.setPropertyAmount(skhPropertyAmount);
        skhynix.setDebtAmount(skhDebtAmount);
        skhynix.setCapitalAmount(skhSalesAmount, skhDebtAmount);

        System.out.println(hcc.toString());
        System.out.println(lgChem.toString());
        System.out.println(lotteChemical.toString());
        System.out.println(lgElectronics.toString());
        System.out.println(samsungElectronics.toString());
        System.out.println(skhynix.toString());
    }

}
