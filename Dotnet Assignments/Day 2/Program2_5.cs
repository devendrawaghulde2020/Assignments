using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace AcceptStudentData_2_5
{
    class Program
    {

        public int average(int a, int b, int c, int d, int e)
        {
            return ((a + b + c + d + e) / 5);
        }

        public void concat(string s1, string s2)
        {
            Console.WriteLine(s1 + s2);
        }

        static void Main(string[] args)
        {
            int f,g,h,i,j;
            string marks1, marks2, marks3, marks4, marks5;
            string name1, name2, name3, name4, name5;
           marks1 = Console.ReadLine();
           marks2 = Console.ReadLine();
           marks3 = Console.ReadLine();
           marks4 = Console.ReadLine();
           marks5 = Console.ReadLine();
           
           bool m1 = int.TryParse(marks1, out f);
           bool m2 = int.TryParse(marks2, out g);
           bool m3 = int.TryParse(marks3, out h);
           bool m4 = int.TryParse(marks4, out i);
           bool m5 = int.TryParse(marks5, out j);

          name1 = Console.ReadLine();
          name2 = Console.ReadLine();
          name3 = Console.ReadLine();
          name4 = Console.ReadLine();
          name5 = Console.ReadLine();

         int res= new Program().average(f,g,h,i,j);
         new Program().concat(name1,name2);
         Console.WriteLine(res);
         Console.ReadLine();

        }
    }
}
