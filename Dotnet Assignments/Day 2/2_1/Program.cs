using System;
using Squaring_2_1;

namespace Squaring_2_1Lib
{
    class Program
    {
        static void Main(string[] args)
        {
            Squaring s = new Squaring();
            int res=s.sqr(5);
            Console.WriteLine(res);
            Console.ReadLine();
        }
    }
}
