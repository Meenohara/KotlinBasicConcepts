package intro2;

import intro.InteropKt;
import intro.JVMNameOverloadKt;
import intro.Util;
import intro.NamedDefArgmtsKt;


class UsingFoodiffPkg {
    public static void main(String[] args)
    {
        InteropKt.foo1();
        System.out.println(InteropKt.foo1());

        Util.foo2();
        System.out.println(Util.foo2());

        NamedDefArgmtsKt.sum(3,4,5);
        //in Java interoperability it is important to specify all arguments
        //for functions which have default arguments
        //This is to minimize the number of functions generated under the hood
        // In Java we would need to generate too many versions of overloaded functions
        //the functions generated are one with all arguments
        //and another auxiliary function containing info about all default values and cannot be called
        System.out.println(NamedDefArgmtsKt.sum(3,4,5));
        System.out.println(NamedDefArgmtsKt.sum(3,4,5));

        JVMNameOverloadKt.product();//original definition has arguments
        System.out.println(JVMNameOverloadKt.product());
        JVMNameOverloadKt.product(5,8,9);//original definition has arguments
        System.out.println(JVMNameOverloadKt.product(5,8,9));
        //JVMNameOverloadKt.product(a=900);//original definition has arguments
        //System.out.println(JVMNameOverloadKt.product());//TODO Investigate
    }
}
