/* C++ code produced by gperf version 3.0.3 */
/* Command-line: /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain/usr/bin/gperf -L C++ -E -t /private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/modbus-generated/KrollGeneratedBindings.gperf  */
/* Computed positions: -k'' */

#line 3 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/modbus-generated/KrollGeneratedBindings.gperf"


#include <string.h>
#include <v8.h>
#include <KrollBindings.h>

#include "de.appwerft.modbus.ModbusModule.h"
#include "de.appwerft.modbus.SimpleProcessImageProxy.h"
#include "de.appwerft.modbus.MasterConnectionProxy.h"
#include "de.appwerft.modbus.CouplerModule.h"


#line 16 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/modbus-generated/KrollGeneratedBindings.gperf"
struct titanium::bindings::BindEntry;
/* maximum key range = 12, duplicates = 0 */

class ModbusBindings
{
private:
  static inline unsigned int hash (const char *str, unsigned int len);
public:
  static struct titanium::bindings::BindEntry *lookupGeneratedInit (const char *str, unsigned int len);
};

inline /*ARGSUSED*/
unsigned int
ModbusBindings::hash (register const char *str, register unsigned int len)
{
  return len;
}

struct titanium::bindings::BindEntry *
ModbusBindings::lookupGeneratedInit (register const char *str, register unsigned int len)
{
  enum
    {
      TOTAL_KEYWORDS = 4,
      MIN_WORD_LENGTH = 31,
      MAX_WORD_LENGTH = 42,
      MIN_HASH_VALUE = 31,
      MAX_HASH_VALUE = 42
    };

  static struct titanium::bindings::BindEntry wordlist[] =
    {
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""},
#line 18 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/modbus-generated/KrollGeneratedBindings.gperf"
      {"de.appwerft.modbus.ModbusModule", ::de::appwerft::modbus::ModbusModule::bindProxy, ::de::appwerft::modbus::ModbusModule::dispose},
#line 21 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/modbus-generated/KrollGeneratedBindings.gperf"
      {"de.appwerft.modbus.CouplerModule", ::de::appwerft::modbus::modbus::CouplerModule::bindProxy, ::de::appwerft::modbus::modbus::CouplerModule::dispose},
      {""}, {""}, {""}, {""}, {""}, {""}, {""},
#line 20 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/modbus-generated/KrollGeneratedBindings.gperf"
      {"de.appwerft.modbus.MasterConnectionProxy", ::de::appwerft::modbus::modbus::MasterConnectionProxy::bindProxy, ::de::appwerft::modbus::modbus::MasterConnectionProxy::dispose},
      {""},
#line 19 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/modbus-generated/KrollGeneratedBindings.gperf"
      {"de.appwerft.modbus.SimpleProcessImageProxy", ::de::appwerft::modbus::modbus::SimpleProcessImageProxy::bindProxy, ::de::appwerft::modbus::modbus::SimpleProcessImageProxy::dispose}
    };

  if (len <= MAX_WORD_LENGTH && len >= MIN_WORD_LENGTH)
    {
      unsigned int key = hash (str, len);

      if (key <= MAX_HASH_VALUE)
        {
          register const char *s = wordlist[key].name;

          if (*str == *s && !strcmp (str + 1, s + 1))
            return &wordlist[key];
        }
    }
  return 0;
}
#line 22 "/private/var/folders/dp/_57t8_6j247dh0h7mknf97600000gn/T/fuerst/modbus-generated/KrollGeneratedBindings.gperf"

