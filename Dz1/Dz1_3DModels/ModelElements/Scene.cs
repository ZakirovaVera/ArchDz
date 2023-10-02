using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dz1_3DModels.ModelElements
{
    internal class Scene
    {
        public Scene(PoligonalModel[] models, Flash[] flashes)
        {
            Models = models;
            Flashes = flashes;
        }


        public int Id { get; set; }
        public PoligonalModel[] Models { get; set; }
        public Flash[] Flashes { get; set; }


        public Type Method1(Type type)
        {
            return type;
        }
        public Type Method2(Type type1, Type type2)
        {
            return type1;
        }
    }
}
