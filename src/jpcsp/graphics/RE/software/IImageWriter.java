/*

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
package jpcsp.graphics.RE.software;

import jpcsp.memory.IMemoryWriter;

/**
 * @author gid15
 *
 * Interface for writing images to memory.
 * The image is written sequentially to memory from the left top corner
 * to the right bottom corner.
 * The value of the pixel currently stored into memory can be retrieved
 * before writing a new value.
 */
public interface IImageWriter extends IMemoryWriter {
	/**
	 * Read the current pixel color from memory. This is the color of the pixel
	 * that will be overwritten by the next IMemoryWriter.writeNext() call.
	 * 
	 * The pixel color is always returned in the format GU_COLOR_8888 (ABGR).
	 * 
	 * @return   the color of the current pixel in the format GU_COLOR_8888 (ABGR)
	 */
	public int readCurrent();
}
