package javastudy.pkgDelivBox;
public class Dbox {
    int sID;
    String kindOfProduct; //김치,화장품,샴푸,초콜릿
    String size; //대,중,소
    Boolean boNang; //냉장효과 유무
    Boolean Fragile; //파손주의 유무
    String Address; //도착지 주소: 서울,인천,경기,강원,충남,충북,전북,전남,경북,경남
    int depatureHour; //0~8시
    int arrivalHour; //15~23시

    public Dbox(int sID) {
        this.sID=sID;}
    public Dbox(int sID, String size, Boolean boNang) {
        this.sID=sID;
        this.size=size;
        this.boNang=boNang;
    }
    }