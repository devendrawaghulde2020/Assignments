using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using day3_4_library;

namespace day3_4_console
{
    class Program
    {
        static void Main(string[] args)
        {
            MyCalculator m1 = new MyCalculator();
           int a= m1.add(5,10);
            int b=m1.product(3, 4);
            int c = m1.cube(1);
            Console.WriteLine("The addition is:\n{0}\nThe Product is:\n{1}",a,b);
            Console.ReadLine();
            
        }
    }
}
