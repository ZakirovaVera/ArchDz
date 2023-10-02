using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dz1_3DModels.InMemoryModel
{
    internal interface IModelChangedObserver
    {
        public void ApplyChangedObserver();
    }
}
