using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CClient
{
    public class Encoder
    {
        public static string EncodeMessage(string message)
        {
            return 'm' + message + ';';
        }

        public static string DecodeMessage(string encodedMessage)
        {
            return encodedMessage[0] == 'm' ? encodedMessage.Substring(1, encodedMessage.Length - 2) : null;
        }

        public static string EncodeType(byte row, byte coloumn, bool enabled)
        {

            return enabled ? "s" + row.ToString() + coloumn.ToString() + ":e;" : "s" + row + coloumn + ":d;"; 
        }

        public static bool DecodeType(string encodedMessage, out byte? row, out byte? coloumn, out bool? enabled)
        {
            if ((encodedMessage.Length == 6) && 
                (encodedMessage[0] == 's') && 
                (char.IsDigit(encodedMessage[1]) && 
                (char.IsDigit(encodedMessage[2]) && 
                (encodedMessage[3] == ':') && 
                ((encodedMessage[4] == 'e') || (encodedMessage[4] == 'd')) && 
                (encodedMessage[5] == ';'))))
            {
                row = (byte) int.Parse(encodedMessage[1].ToString());
                coloumn = (byte) int.Parse(encodedMessage[2].ToString());
                enabled = encodedMessage[4] == 'e' ? true : false;
                return true;
            }
            else
            {
                row = null;
                coloumn = null;
                enabled = null;
                return false;
            }
        }
    }
}
