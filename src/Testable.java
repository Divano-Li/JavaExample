import java.lang.annotation.*;
//ʹ��Jdk��Ԫ����Annotation��@Retention
@Retention(RetentionPolicy.RUNTIME)
//ʹ��JDK��Ԫ����Annotation��@Target
@Target(ElementType.METHOD)
//����һ�����ע�⣬�������κγ�Ա�����������ɴ���Ԫ����
public @interface Testable
{
}

