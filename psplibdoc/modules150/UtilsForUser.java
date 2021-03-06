/* This autogenerated file is part of jpcsp. */
/*
This file is part of jpcsp.

Jpcsp is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Jpcsp is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jpcsp.  If not, see <http://www.gnu.org/licenses/>.
 */

package jpcsp.HLE.modules150;

import jpcsp.HLE.Modules;
import jpcsp.HLE.modules.HLEModule;
import jpcsp.HLE.modules.HLEModuleFunction;
import jpcsp.HLE.modules.HLEModuleManager;

import jpcsp.Memory;
import jpcsp.Processor;

import jpcsp.Allegrex.CpuState; // New-Style Processor

public class UtilsForUser implements HLEModule {
	@Override
	public String getName() { return "UtilsForUser"; }
	
	@Override
	public void installModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.addFunction(sceKernelDcacheInvalidateRangeFunction, 0xBFA98062);
			mm.addFunction(sceKernelIcacheInvalidateRangeFunction, 0xC2DF770E);
			mm.addFunction(sceKernelUtilsMd5DigestFunction, 0xC8186A58);
			mm.addFunction(sceKernelUtilsMd5BlockInitFunction, 0x9E5C5086);
			mm.addFunction(sceKernelUtilsMd5BlockUpdateFunction, 0x61E1E525);
			mm.addFunction(sceKernelUtilsMd5BlockResultFunction, 0xB8D24E78);
			mm.addFunction(sceKernelUtilsSha1DigestFunction, 0x840259F1);
			mm.addFunction(sceKernelUtilsSha1BlockInitFunction, 0xF8FCD5BA);
			mm.addFunction(sceKernelUtilsSha1BlockUpdateFunction, 0x346F6DA8);
			mm.addFunction(sceKernelUtilsSha1BlockResultFunction, 0x585F1C09);
			mm.addFunction(sceKernelUtilsMt19937InitFunction, 0xE860E75E);
			mm.addFunction(sceKernelUtilsMt19937UIntFunction, 0x06FB8A63);
			mm.addFunction(sceKernelGetGPIFunction, 0x37FB5C42);
			mm.addFunction(sceKernelSetGPOFunction, 0x6AD345D7);
			mm.addFunction(sceKernelLibcClockFunction, 0x91E4F6A7);
			mm.addFunction(sceKernelLibcTimeFunction, 0x27CC57F0);
			mm.addFunction(sceKernelLibcGettimeofdayFunction, 0x71EC4271);
			mm.addFunction(sceKernelDcacheWritebackAllFunction, 0x79D1C3FA);
			mm.addFunction(sceKernelDcacheWritebackInvalidateAllFunction, 0xB435DEC5);
			mm.addFunction(sceKernelDcacheWritebackRangeFunction, 0x3EE30821);
			mm.addFunction(sceKernelDcacheWritebackInvalidateRangeFunction, 0x34B9FA9E);
			mm.addFunction(sceKernelDcacheProbeFunction, 0x80001C4C);
			mm.addFunction(sceKernelDcacheReadTagFunction, 0x16641D70);
			mm.addFunction(sceKernelIcacheInvalidateAllFunction, 0x920F104A);
			mm.addFunction(sceKernelIcacheProbeFunction, 0x4FD31C9D);
			mm.addFunction(sceKernelIcacheReadTagFunction, 0xFB05FAD0);
			
		}
	}
	
	@Override
	public void uninstallModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.removeFunction(sceKernelDcacheInvalidateRangeFunction);
			mm.removeFunction(sceKernelIcacheInvalidateRangeFunction);
			mm.removeFunction(sceKernelUtilsMd5DigestFunction);
			mm.removeFunction(sceKernelUtilsMd5BlockInitFunction);
			mm.removeFunction(sceKernelUtilsMd5BlockUpdateFunction);
			mm.removeFunction(sceKernelUtilsMd5BlockResultFunction);
			mm.removeFunction(sceKernelUtilsSha1DigestFunction);
			mm.removeFunction(sceKernelUtilsSha1BlockInitFunction);
			mm.removeFunction(sceKernelUtilsSha1BlockUpdateFunction);
			mm.removeFunction(sceKernelUtilsSha1BlockResultFunction);
			mm.removeFunction(sceKernelUtilsMt19937InitFunction);
			mm.removeFunction(sceKernelUtilsMt19937UIntFunction);
			mm.removeFunction(sceKernelGetGPIFunction);
			mm.removeFunction(sceKernelSetGPOFunction);
			mm.removeFunction(sceKernelLibcClockFunction);
			mm.removeFunction(sceKernelLibcTimeFunction);
			mm.removeFunction(sceKernelLibcGettimeofdayFunction);
			mm.removeFunction(sceKernelDcacheWritebackAllFunction);
			mm.removeFunction(sceKernelDcacheWritebackInvalidateAllFunction);
			mm.removeFunction(sceKernelDcacheWritebackRangeFunction);
			mm.removeFunction(sceKernelDcacheWritebackInvalidateRangeFunction);
			mm.removeFunction(sceKernelDcacheProbeFunction);
			mm.removeFunction(sceKernelDcacheReadTagFunction);
			mm.removeFunction(sceKernelIcacheInvalidateAllFunction);
			mm.removeFunction(sceKernelIcacheProbeFunction);
			mm.removeFunction(sceKernelIcacheReadTagFunction);
			
		}
	}
	
	
	public void sceKernelDcacheInvalidateRange(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelDcacheInvalidateRange [0xBFA98062]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelIcacheInvalidateRange(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelIcacheInvalidateRange [0xC2DF770E]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelUtilsMd5Digest(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelUtilsMd5Digest [0xC8186A58]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelUtilsMd5BlockInit(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelUtilsMd5BlockInit [0x9E5C5086]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelUtilsMd5BlockUpdate(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelUtilsMd5BlockUpdate [0x61E1E525]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelUtilsMd5BlockResult(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelUtilsMd5BlockResult [0xB8D24E78]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelUtilsSha1Digest(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelUtilsSha1Digest [0x840259F1]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelUtilsSha1BlockInit(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelUtilsSha1BlockInit [0xF8FCD5BA]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelUtilsSha1BlockUpdate(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelUtilsSha1BlockUpdate [0x346F6DA8]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelUtilsSha1BlockResult(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelUtilsSha1BlockResult [0x585F1C09]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelUtilsMt19937Init(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelUtilsMt19937Init [0xE860E75E]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelUtilsMt19937UInt(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelUtilsMt19937UInt [0x06FB8A63]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelGetGPI(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelGetGPI [0x37FB5C42]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelSetGPO(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelSetGPO [0x6AD345D7]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelLibcClock(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelLibcClock [0x91E4F6A7]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelLibcTime(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelLibcTime [0x27CC57F0]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelLibcGettimeofday(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelLibcGettimeofday [0x71EC4271]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelDcacheWritebackAll(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelDcacheWritebackAll [0x79D1C3FA]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelDcacheWritebackInvalidateAll(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelDcacheWritebackInvalidateAll [0xB435DEC5]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelDcacheWritebackRange(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelDcacheWritebackRange [0x3EE30821]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelDcacheWritebackInvalidateRange(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelDcacheWritebackInvalidateRange [0x34B9FA9E]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelDcacheProbe(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelDcacheProbe [0x80001C4C]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelDcacheReadTag(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelDcacheReadTag [0x16641D70]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelIcacheInvalidateAll(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelIcacheInvalidateAll [0x920F104A]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelIcacheProbe(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelIcacheProbe [0x4FD31C9D]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public void sceKernelIcacheReadTag(Processor processor) {
		CpuState cpu = processor.cpu;

		Modules.log.debug("Unimplemented NID function sceKernelIcacheReadTag [0xFB05FAD0]");

		cpu.gpr[2] = 0xDEADC0DE;
	}
    
	public final HLEModuleFunction sceKernelDcacheInvalidateRangeFunction = new HLEModuleFunction("UtilsForUser", "sceKernelDcacheInvalidateRange") {
		@Override
		public final void execute(Processor processor) {
			sceKernelDcacheInvalidateRange(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelDcacheInvalidateRange(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelIcacheInvalidateRangeFunction = new HLEModuleFunction("UtilsForUser", "sceKernelIcacheInvalidateRange") {
		@Override
		public final void execute(Processor processor) {
			sceKernelIcacheInvalidateRange(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelIcacheInvalidateRange(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelUtilsMd5DigestFunction = new HLEModuleFunction("UtilsForUser", "sceKernelUtilsMd5Digest") {
		@Override
		public final void execute(Processor processor) {
			sceKernelUtilsMd5Digest(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelUtilsMd5Digest(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelUtilsMd5BlockInitFunction = new HLEModuleFunction("UtilsForUser", "sceKernelUtilsMd5BlockInit") {
		@Override
		public final void execute(Processor processor) {
			sceKernelUtilsMd5BlockInit(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelUtilsMd5BlockInit(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelUtilsMd5BlockUpdateFunction = new HLEModuleFunction("UtilsForUser", "sceKernelUtilsMd5BlockUpdate") {
		@Override
		public final void execute(Processor processor) {
			sceKernelUtilsMd5BlockUpdate(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelUtilsMd5BlockUpdate(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelUtilsMd5BlockResultFunction = new HLEModuleFunction("UtilsForUser", "sceKernelUtilsMd5BlockResult") {
		@Override
		public final void execute(Processor processor) {
			sceKernelUtilsMd5BlockResult(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelUtilsMd5BlockResult(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelUtilsSha1DigestFunction = new HLEModuleFunction("UtilsForUser", "sceKernelUtilsSha1Digest") {
		@Override
		public final void execute(Processor processor) {
			sceKernelUtilsSha1Digest(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelUtilsSha1Digest(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelUtilsSha1BlockInitFunction = new HLEModuleFunction("UtilsForUser", "sceKernelUtilsSha1BlockInit") {
		@Override
		public final void execute(Processor processor) {
			sceKernelUtilsSha1BlockInit(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelUtilsSha1BlockInit(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelUtilsSha1BlockUpdateFunction = new HLEModuleFunction("UtilsForUser", "sceKernelUtilsSha1BlockUpdate") {
		@Override
		public final void execute(Processor processor) {
			sceKernelUtilsSha1BlockUpdate(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelUtilsSha1BlockUpdate(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelUtilsSha1BlockResultFunction = new HLEModuleFunction("UtilsForUser", "sceKernelUtilsSha1BlockResult") {
		@Override
		public final void execute(Processor processor) {
			sceKernelUtilsSha1BlockResult(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelUtilsSha1BlockResult(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelUtilsMt19937InitFunction = new HLEModuleFunction("UtilsForUser", "sceKernelUtilsMt19937Init") {
		@Override
		public final void execute(Processor processor) {
			sceKernelUtilsMt19937Init(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelUtilsMt19937Init(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelUtilsMt19937UIntFunction = new HLEModuleFunction("UtilsForUser", "sceKernelUtilsMt19937UInt") {
		@Override
		public final void execute(Processor processor) {
			sceKernelUtilsMt19937UInt(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelUtilsMt19937UInt(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelGetGPIFunction = new HLEModuleFunction("UtilsForUser", "sceKernelGetGPI") {
		@Override
		public final void execute(Processor processor) {
			sceKernelGetGPI(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelGetGPI(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelSetGPOFunction = new HLEModuleFunction("UtilsForUser", "sceKernelSetGPO") {
		@Override
		public final void execute(Processor processor) {
			sceKernelSetGPO(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelSetGPO(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelLibcClockFunction = new HLEModuleFunction("UtilsForUser", "sceKernelLibcClock") {
		@Override
		public final void execute(Processor processor) {
			sceKernelLibcClock(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelLibcClock(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelLibcTimeFunction = new HLEModuleFunction("UtilsForUser", "sceKernelLibcTime") {
		@Override
		public final void execute(Processor processor) {
			sceKernelLibcTime(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelLibcTime(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelLibcGettimeofdayFunction = new HLEModuleFunction("UtilsForUser", "sceKernelLibcGettimeofday") {
		@Override
		public final void execute(Processor processor) {
			sceKernelLibcGettimeofday(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelLibcGettimeofday(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelDcacheWritebackAllFunction = new HLEModuleFunction("UtilsForUser", "sceKernelDcacheWritebackAll") {
		@Override
		public final void execute(Processor processor) {
			sceKernelDcacheWritebackAll(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelDcacheWritebackAll(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelDcacheWritebackInvalidateAllFunction = new HLEModuleFunction("UtilsForUser", "sceKernelDcacheWritebackInvalidateAll") {
		@Override
		public final void execute(Processor processor) {
			sceKernelDcacheWritebackInvalidateAll(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelDcacheWritebackInvalidateAll(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelDcacheWritebackRangeFunction = new HLEModuleFunction("UtilsForUser", "sceKernelDcacheWritebackRange") {
		@Override
		public final void execute(Processor processor) {
			sceKernelDcacheWritebackRange(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelDcacheWritebackRange(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelDcacheWritebackInvalidateRangeFunction = new HLEModuleFunction("UtilsForUser", "sceKernelDcacheWritebackInvalidateRange") {
		@Override
		public final void execute(Processor processor) {
			sceKernelDcacheWritebackInvalidateRange(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelDcacheWritebackInvalidateRange(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelDcacheProbeFunction = new HLEModuleFunction("UtilsForUser", "sceKernelDcacheProbe") {
		@Override
		public final void execute(Processor processor) {
			sceKernelDcacheProbe(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelDcacheProbe(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelDcacheReadTagFunction = new HLEModuleFunction("UtilsForUser", "sceKernelDcacheReadTag") {
		@Override
		public final void execute(Processor processor) {
			sceKernelDcacheReadTag(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelDcacheReadTag(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelIcacheInvalidateAllFunction = new HLEModuleFunction("UtilsForUser", "sceKernelIcacheInvalidateAll") {
		@Override
		public final void execute(Processor processor) {
			sceKernelIcacheInvalidateAll(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelIcacheInvalidateAll(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelIcacheProbeFunction = new HLEModuleFunction("UtilsForUser", "sceKernelIcacheProbe") {
		@Override
		public final void execute(Processor processor) {
			sceKernelIcacheProbe(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelIcacheProbe(processor);";
		}
	};
    
	public final HLEModuleFunction sceKernelIcacheReadTagFunction = new HLEModuleFunction("UtilsForUser", "sceKernelIcacheReadTag") {
		@Override
		public final void execute(Processor processor) {
			sceKernelIcacheReadTag(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.UtilsForUserModule.sceKernelIcacheReadTag(processor);";
		}
	};
    
};
