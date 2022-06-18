package hello.core.order;

public class Order {
    /*
    * 필드 (Field)
    클래스를 정의할 때 클래스의 속성값을 저장하기 위해 선언하는 변수들을 필드라고 합니다.

    * 필드는 클래스 안에서 선언 위치에 따라 3가지로 구분됩니다.
    1) 지역 변수 (local variable)
    2) 인스턴스 변수 (instance variable)
    3) 클래스 변수 (class variable)
    */
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    // command + N
    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    // 비즈니스 계산 로직
    public int calculatePrice() {
        return itemPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
