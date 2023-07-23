using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LINQ
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<string> list = new List<string>();
            list.Add("Harshada");
            list.Add("Akshada");
            list.Add("Arthesh");

            //var result = from items in list select items;
            //var result = from items in list where items.Contains("Harshada") select items;
            var result = list.Where(s => s.Contains("ada"));

            foreach (var items in result)
                   Console.WriteLine(items);


            List<int> list1 = new List<int>();
            list1.Add(11);
            list1.Add(22);
            list1.Add(33);
            list1.Add(58);

            list1.RemoveAt(3);

            var result2 = from items in list1 where items > 22 select items;

            foreach (var items in result2)
                Console.WriteLine(items);


            //Sorted List --> Collections
            SortedList<int, string> keyValuePairs = new SortedList<int, string>();
            keyValuePairs.Add(1, "Harsh");
            keyValuePairs.Add(2, "Aksh");
            keyValuePairs.Add(3, "Arth");

            //foreach (KeyValuePair<int, string> i in keyValuePairs)
            //    Console.WriteLine(i.Key + " " + i.Value);

            var result1 = from items in keyValuePairs select items;

            foreach (var i in result1)
                Console.WriteLine(i.Key + " " + i.Value);

            Console.ReadLine();
        }
    }
}
