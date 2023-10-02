using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Numerics;
using System.Text;
using System.Threading.Tasks;

namespace Dz1_3DModels.ModelElements
{
    internal class Flash
    {
        public Point Location { get; set; }
        public Point Angle { get; set; }
        public Color Color { get; set; }
        public float Power { get; set; }


        public void Rotate(Point angle)
        {
        }

        public void Move(Point point)
        {
        }
    }
}
