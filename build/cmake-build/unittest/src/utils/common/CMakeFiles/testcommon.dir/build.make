# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.10

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/test/sumo

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/test/sumo/build/cmake-build

# Include any dependencies generated for this target.
include unittest/src/utils/common/CMakeFiles/testcommon.dir/depend.make

# Include the progress variables for this target.
include unittest/src/utils/common/CMakeFiles/testcommon.dir/progress.make

# Include the compile flags for this target's objects.
include unittest/src/utils/common/CMakeFiles/testcommon.dir/flags.make

unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o: unittest/src/utils/common/CMakeFiles/testcommon.dir/flags.make
unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o: ../../unittest/src/utils/common/StringTokenizerTest.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/test/sumo/build/cmake-build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o -c /home/test/sumo/unittest/src/utils/common/StringTokenizerTest.cpp

unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.i"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/test/sumo/unittest/src/utils/common/StringTokenizerTest.cpp > CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.i

unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.s"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/test/sumo/unittest/src/utils/common/StringTokenizerTest.cpp -o CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.s

unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o.requires:

.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o.requires

unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o.provides: unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o.requires
	$(MAKE) -f unittest/src/utils/common/CMakeFiles/testcommon.dir/build.make unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o.provides.build
.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o.provides

unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o.provides.build: unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o


unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o: unittest/src/utils/common/CMakeFiles/testcommon.dir/flags.make
unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o: ../../unittest/src/utils/common/FileHelpersTest.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/test/sumo/build/cmake-build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o -c /home/test/sumo/unittest/src/utils/common/FileHelpersTest.cpp

unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/testcommon.dir/FileHelpersTest.cpp.i"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/test/sumo/unittest/src/utils/common/FileHelpersTest.cpp > CMakeFiles/testcommon.dir/FileHelpersTest.cpp.i

unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/testcommon.dir/FileHelpersTest.cpp.s"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/test/sumo/unittest/src/utils/common/FileHelpersTest.cpp -o CMakeFiles/testcommon.dir/FileHelpersTest.cpp.s

unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o.requires:

.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o.requires

unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o.provides: unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o.requires
	$(MAKE) -f unittest/src/utils/common/CMakeFiles/testcommon.dir/build.make unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o.provides.build
.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o.provides

unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o.provides.build: unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o


unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o: unittest/src/utils/common/CMakeFiles/testcommon.dir/flags.make
unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o: ../../unittest/src/utils/common/StringUtilsTest.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/test/sumo/build/cmake-build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building CXX object unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o -c /home/test/sumo/unittest/src/utils/common/StringUtilsTest.cpp

unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/testcommon.dir/StringUtilsTest.cpp.i"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/test/sumo/unittest/src/utils/common/StringUtilsTest.cpp > CMakeFiles/testcommon.dir/StringUtilsTest.cpp.i

unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/testcommon.dir/StringUtilsTest.cpp.s"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/test/sumo/unittest/src/utils/common/StringUtilsTest.cpp -o CMakeFiles/testcommon.dir/StringUtilsTest.cpp.s

unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o.requires:

.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o.requires

unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o.provides: unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o.requires
	$(MAKE) -f unittest/src/utils/common/CMakeFiles/testcommon.dir/build.make unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o.provides.build
.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o.provides

unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o.provides.build: unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o


unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o: unittest/src/utils/common/CMakeFiles/testcommon.dir/flags.make
unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o: ../../unittest/src/utils/common/RGBColorTest.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/test/sumo/build/cmake-build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Building CXX object unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/testcommon.dir/RGBColorTest.cpp.o -c /home/test/sumo/unittest/src/utils/common/RGBColorTest.cpp

unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/testcommon.dir/RGBColorTest.cpp.i"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/test/sumo/unittest/src/utils/common/RGBColorTest.cpp > CMakeFiles/testcommon.dir/RGBColorTest.cpp.i

unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/testcommon.dir/RGBColorTest.cpp.s"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/test/sumo/unittest/src/utils/common/RGBColorTest.cpp -o CMakeFiles/testcommon.dir/RGBColorTest.cpp.s

unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o.requires:

.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o.requires

unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o.provides: unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o.requires
	$(MAKE) -f unittest/src/utils/common/CMakeFiles/testcommon.dir/build.make unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o.provides.build
.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o.provides

unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o.provides.build: unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o


unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o: unittest/src/utils/common/CMakeFiles/testcommon.dir/flags.make
unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o: ../../unittest/src/utils/common/ValueTimeLineTest.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/test/sumo/build/cmake-build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_5) "Building CXX object unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o -c /home/test/sumo/unittest/src/utils/common/ValueTimeLineTest.cpp

unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.i"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/test/sumo/unittest/src/utils/common/ValueTimeLineTest.cpp > CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.i

unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.s"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/test/sumo/unittest/src/utils/common/ValueTimeLineTest.cpp -o CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.s

unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o.requires:

.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o.requires

unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o.provides: unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o.requires
	$(MAKE) -f unittest/src/utils/common/CMakeFiles/testcommon.dir/build.make unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o.provides.build
.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o.provides

unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o.provides.build: unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o


# Object files for target testcommon
testcommon_OBJECTS = \
"CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o" \
"CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o" \
"CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o" \
"CMakeFiles/testcommon.dir/RGBColorTest.cpp.o" \
"CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o"

# External object files for target testcommon
testcommon_EXTERNAL_OBJECTS =

../../bin/testcommon: unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o
../../bin/testcommon: unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o
../../bin/testcommon: unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o
../../bin/testcommon: unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o
../../bin/testcommon: unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o
../../bin/testcommon: unittest/src/utils/common/CMakeFiles/testcommon.dir/build.make
../../bin/testcommon: src/utils/distribution/libutils_distribution.a
../../bin/testcommon: src/utils/shapes/libutils_shapes.a
../../bin/testcommon: src/utils/options/libutils_options.a
../../bin/testcommon: src/utils/xml/libutils_xml.a
../../bin/testcommon: src/utils/geom/libutils_geom.a
../../bin/testcommon: src/utils/common/libutils_common.a
../../bin/testcommon: src/utils/importio/libutils_importio.a
../../bin/testcommon: src/utils/iodevices/libutils_iodevices.a
../../bin/testcommon: src/utils/traction_wire/libutils_traction_wire.a
../../bin/testcommon: src/foreign/tcpip/libforeign_tcpip.a
../../bin/testcommon: /usr/lib/x86_64-linux-gnu/libxerces-c.so
../../bin/testcommon: /usr/lib/x86_64-linux-gnu/libz.so
../../bin/testcommon: /usr/lib/x86_64-linux-gnu/libproj.so
../../bin/testcommon: /usr/lib/libgtest.a
../../bin/testcommon: /usr/lib/libgtest_main.a
../../bin/testcommon: unittest/src/utils/common/CMakeFiles/testcommon.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/test/sumo/build/cmake-build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_6) "Linking CXX executable ../../../../../../bin/testcommon"
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/testcommon.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
unittest/src/utils/common/CMakeFiles/testcommon.dir/build: ../../bin/testcommon

.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/build

unittest/src/utils/common/CMakeFiles/testcommon.dir/requires: unittest/src/utils/common/CMakeFiles/testcommon.dir/StringTokenizerTest.cpp.o.requires
unittest/src/utils/common/CMakeFiles/testcommon.dir/requires: unittest/src/utils/common/CMakeFiles/testcommon.dir/FileHelpersTest.cpp.o.requires
unittest/src/utils/common/CMakeFiles/testcommon.dir/requires: unittest/src/utils/common/CMakeFiles/testcommon.dir/StringUtilsTest.cpp.o.requires
unittest/src/utils/common/CMakeFiles/testcommon.dir/requires: unittest/src/utils/common/CMakeFiles/testcommon.dir/RGBColorTest.cpp.o.requires
unittest/src/utils/common/CMakeFiles/testcommon.dir/requires: unittest/src/utils/common/CMakeFiles/testcommon.dir/ValueTimeLineTest.cpp.o.requires

.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/requires

unittest/src/utils/common/CMakeFiles/testcommon.dir/clean:
	cd /home/test/sumo/build/cmake-build/unittest/src/utils/common && $(CMAKE_COMMAND) -P CMakeFiles/testcommon.dir/cmake_clean.cmake
.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/clean

unittest/src/utils/common/CMakeFiles/testcommon.dir/depend:
	cd /home/test/sumo/build/cmake-build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/test/sumo /home/test/sumo/unittest/src/utils/common /home/test/sumo/build/cmake-build /home/test/sumo/build/cmake-build/unittest/src/utils/common /home/test/sumo/build/cmake-build/unittest/src/utils/common/CMakeFiles/testcommon.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : unittest/src/utils/common/CMakeFiles/testcommon.dir/depend
