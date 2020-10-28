using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Float_squareUser_2_4
{
    class Program
    {
        static void Main(string[] args)
        {
            string a;
            float f;
            Console.WriteLine("Enter Float Number for Squaring:\n");
            a = Console.ReadLine();
            bool a1 = float.TryParse(a, out f);
            if (a1 == true)
            {
                Console.WriteLine(f*f);
            }
            Console.ReadLine();
        }
    }
}
