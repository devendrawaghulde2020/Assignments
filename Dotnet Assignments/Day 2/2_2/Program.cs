using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using ClassLibrary2_2;

namespace ConsoleApplication2_2_SharedLib
{
    class Program
    {
        static void Main(string[] args)
        {
            Class1 c = new Class1();
            int res=c.add(2, 3);
            Console.WriteLine(res);
            Console.ReadLine();
        }
    }
}
