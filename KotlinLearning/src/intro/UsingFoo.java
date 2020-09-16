package intro;

import intro.InteropKt;
import intro.Util;
import intro.NamedDefArgmtsKt;
import intro.JVMNameOverloadKt;

public class UsingFoo {
    public static void main(String[] args)
    {
        InteropKt.foo1();
        System.out.println(InteropKt.foo1());

        Util.foo2();
        System.out.println(Util.foo2());

        NamedDefArgmtsKt.sum(3,4,5);
        System.out.println(NamedDefArgmtsKt.sum(3,4,5));

        JVMNameOverloadKt.product();//original definition has arguments
        System.out.println(JVMNameOverloadKt.product());
        JVMNameOverloadKt.product(5,8,9);//original definition has arguments
        System.out.println(JVMNameOverloadKt.product(5,8,9));
;

    }
}
