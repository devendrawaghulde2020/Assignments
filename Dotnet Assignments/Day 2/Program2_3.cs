using System;

namespace accepting_from_user_2_3
{
    class Program
    {
        static void Main(string[] args)
        {
            string a, b;
            int f,g;
            Console.WriteLine("Enter two Numbers for Addition:\n");
            a=Console.ReadLine();
            b=Console.ReadLine();
            bool a1 = int.TryParse(a, out f); 
           bool b1 = int.TryParse(b, out g);
           if (a1 == true && b1 == true)
           {
               Console.WriteLine(f+g);
           }
           Console.ReadLine();
        }
    }
}
