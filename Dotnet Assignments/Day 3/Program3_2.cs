using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace day3_2
{
    struct Calculator
    {
        static void  calculate(int a)
        {
            for (int i = 1; i <= a / 2; i++)
            {
                if (a % i == 0)
                { Console.WriteLine(i); }
            }
        }
        static void Main(string[] args)
        {
            string a;
            int f;
            Console.WriteLine("Enter a number to calculate:");
            a = Console.ReadLine();
            bool no = int.TryParse(a, out f);
            calculate(f);
            Console.ReadLine();
        }
    }
}
