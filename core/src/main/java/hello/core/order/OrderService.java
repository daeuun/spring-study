package hello.core.order;

public interface OrderService {
    // 클라이언트는 주문을 생성할 때 (createOrder)
    // 회원id, 상품명, 상품 가격을 넘겨야한다. (파라미터로 넘김)
    // 그러면 return으로 주문 결과를 반환한다. (최종 Order결과를 반환한다)
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
