package jpabook.jpashop.service.query;

import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public class OrderQueryService {
    /*만약 opin-in-view 설정을 false로 한다면 이런 식으로 컨트롤러에 들어갈 지연로딩이 포함된 로직을 하나의 서비스로 따로 빼서 별도의 트랜잭션 아래에 밀어넣고
    * 컨트롤러단에서는 이 메서드를 그저 호출하는 형식으로의 구조 변경을 꽤해야 한다. 참고로 이 로직은 비즈니스 처리쪽보다는 화면에 뿌리는 스펙맞추기가 방점이기
    * 때문에 비즈니스에 집중하는 패키지와 구분하기 위해 따로 패키지를 분기했다.*/

    //컨트롤러단에서 수행됐던 지연로딩을 포함한 로직들을 하나로 말아 만든 메서드가 위치
}
