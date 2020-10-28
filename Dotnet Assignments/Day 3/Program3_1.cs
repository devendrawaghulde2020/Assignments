using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace day3_1
{
    struct Maths
    {
        public static int square(int a)
        { return a * a; }

        public static int cube(int a)
        { return a * a * a; }
    }
    class Program
    {
        static void Main(string[] args)
        {
            int resq=Maths.square(2);
           int rescu= Maths.cube(2);
           Console.WriteLine("{0},{1}",resq,rescu);
           Console.ReadLine();
        }
    }
}
