package GDSC.backend.GDSC_4th_HW;

import org.springframework.stereotype.Component;

@Component
public class A {
    private B b;
    private C c;

    public B getB() {
        return b;
    }

    public C getC() {
        return c;
    }
}
