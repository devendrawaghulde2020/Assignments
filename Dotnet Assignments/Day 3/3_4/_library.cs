using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace day3_4_library
{
    public class MyCalculator
    {
        public int add(int a, int b)
        {
            return a + b;
        }

        public int product(int a, int b)
        {
            return a*b;
        }

        public int add(int a)
        {
            return a*a*a;
        }
    }
}
