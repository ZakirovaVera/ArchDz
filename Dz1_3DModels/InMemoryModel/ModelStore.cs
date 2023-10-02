using Dz1_3DModels.ModelElements;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace Dz1_3DModels.InMemoryModel
{
    internal class ModelStore
    {
        public PoligonalModel[] Models { get; set; } = Array.Empty<PoligonalModel>();
        public List<Scene> Scenes { get; set; } = new();
        public Flash[] Flashes { get; set; } = Array.Empty<Flash>();
        public Camera[] Cameras { get; set; } = Array.Empty<Camera>();
        private IModelChangedObserver[] _changedObservers = Array.Empty<IModelChangedObserver>();


        public void NotifyChange(IModelChanger modelChanger)
        {

        }

        public Scene GetScene(int idScene)
        {
            throw new NotImplementedException();
        }
    }
}
