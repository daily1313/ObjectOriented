## 객체지향의 사실과 오해 정리 

### 1장


- 객체지향 → 실세계를 모방하는 것이 아닌, 새로운 세계를 창조하는 것.

- 객체를 스스로 생각하고 스스로 결정하는 현실 세계의 생명체에 비유하는 것

- 소프트웨어 객체의 자율성을 설명하는데 효과적

- 현실 세계의 사람들이 암묵적인 약속과 명시적인 계약을 기반으로 협력하며 목표를 달성해나가는 과정은 “메세지”를 주고 받으며 공동의 목표를 달성하기 위해 “협력”하는 객체들의 관계를 설명한다.

- 각자의 객체에서 역할이 존재하고, 객체간의 협력이 수반된다. 이에 더해 협력을 하면서 각자의 책임을 수행하기 위해 노력한다.

- 객체지향의 핵심 개념 : 책임, 역할, 협력

- 요청 : 손님 → 캐시어 → 바리스타( 손님 → 캐시어(커피를 주문함), 캐시어 → 바리스타 (커피를 제조하라고 명령을 내림))

- 응답 : 바리스타 → 캐시어 (커피 완성) 캐시어 → 손님(커피를 내놓음)


- 역할에 대한 책임의 특징(역할은 책임을 내포한다)

  - 여러 사람이 동일한 역할 수행, 역할은 대체 가능성을 의미(다른 사람이 역할을 대체해도 요청자 입장에서는 이를 인지하지 못함), 한 사람이 동시에 역할 수행 가능

  - 협력 : 책임을 수행하는 역할들 간의 연쇄적인 요청과 응답을 통해 목표를 달성한다는 것
  
  - 협력에 참여하는 주체 : 객체 (객체는 협력적이여야 하고, 자율적이여야 한다)

  - 여기에서 나오는 자율성은 객체 내부와 외부를 명확하게 구분하는 것으로 나온다.

  - 객체는 다른 객체가 “무엇”을 하는지는 알 수 있지만, “어떻게” 수행하는지는 알 수 없다.

  - 자율적인 객체 : 유지보수가 쉽고, 재사용이 용이한 시스템을 구축할 수 있는지에 대한 가능성 제시

- 객체의 정의

  - 상태와 행동을 지닌 실체

  - 객체지향의 세계에서의 의사소통 수단 : 메세지(Message)

  - 요청을 보내는 것 : 메세지 전송(sender)

  - 요청을 받는 것 : 메세지 수신(receiver)

  - 메세지에 대해 처리하는 것 : 응답(method, 메서드)

  - 캡슐화(encapsulation) : 객체의 행동에서 본인만 그 행동을 어떻게 했는지 알 수 있고, 자율성을 높이는 것에 비롯됨

- 객체지향의 중심 : 객체

  - 클래스들간의 정적 관계 x → 메세지를 주고받는 객체들간의 동적인 관계에서 비롯됨

  - 클래스의 구조와 메서드가 아닌, 객체의 책임, 역할, 협력에 포커스를 두는 것이 핵심

### 1장 고민해볼 내용

- 객체의 역할에 대한 책임의 범위는 어디까지인지 인지하면 좋을듯

- Validater라는 객체를 만들면 로직적으로는 맞지만, Member의 역할과 책임이 너무 수동적으로 변하게 된다.

- 객체의 역할 하나당 책임은 하나다

### 2장 