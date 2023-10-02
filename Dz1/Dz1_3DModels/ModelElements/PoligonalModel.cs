using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dz1_3DModels.ModelElements
{
    internal class PoligonalModel
    {
        public PoligonalModel(Texture[] textures)
        {
            Textures = textures;
        }


        public Poligon[] Poligons { get; set; } = Array.Empty<Poligon>();
        public Texture[] Textures { get; set; }
    }
}
