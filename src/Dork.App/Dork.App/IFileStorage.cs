using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Dork.Core.Domain;
using Dork.Core.Domain.Asset;

namespace Dork.Core.Common
{
    public interface IFileStorage<T> where T : IAsset
    {
        Task SaveFileAsync(string fileName, T asset);
        Task<T> LoadFileAsync(string fileName);
    }
}
