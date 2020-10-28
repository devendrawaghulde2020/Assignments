using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace day3_3
{
    struct emp
    {
        string name;
        double salary;

        public emp(string name, double salary)
        {
            this.name = name;
            this.salary = salary;
        }

        public void display()
        {
            Console.WriteLine(this.name);
            Console.WriteLine(this.salary);
            Console.ReadLine();
        }

        public static void Main(String[] args)
        {
            emp e1 = new emp("Neha",500000);
            emp e2 = new emp("Dev", 100000);
            e1.display();
            e2.display();
        }

    }

}
