# SpringBootJpa
   - 목표 SpringBoot + Jpa + MongoDB.. 소셜 로그인
   
1. 사용 annotation 
@SpringBootApplication -> @Target(ElementType.TYPE)
                          @Retention(RetentionPolicy.RUNTIME)
                          @Documented
                          @Inherited
                          @Configuration
                          @EnableAutoConfiguration
                          @ComponentScan

@Target
 - Target은 어디에 어노테이션을 넣을 수 있는지를 서술합니다. field, method, class가 정의된 곳에 어노테이션을 넣을 수 있습니다.
 * TYPE - class, interface, enumeration에 어노테이션을 적용할 수 있다는 것을 의미합니다.
 * METHOD - method 선언에만 어노테이션을 적용할 수 있다는 것을 의미합니다.
 * PARAMETER - parameter 선언에만 어노테이션을 적용할 수 있다는 것을 의미합니다.
 * PACKAGE - package 선언에만 어노테이션을 적용할 수 있다는 것을 의미합니다.
 * FIELD - field 선언에만 어노테이션을 적용할 수 있다는 것을 의미합니다.
 * LOCAL_VARIABLE - 지역 변수 선언에만 어노테이션을 적용할 수 있다는 것을 의미합니다.
 * CONSTRUCTOR - 생성자에만 어노테이션을 적용할 수 있다는 것을 의미합니다.
 * ANNOTATION_TYPE - 어노테이션 타입에만 어노테이션을 적용할 수 있다는 것을 의미합니다.


