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
include src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/depend.make

# Include the progress variables for this target.
include src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/progress.make

# Include the compile flags for this target's objects.
include src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/flags.make

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/flags.make
src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o: ../../src/utils/traction_wire/Circuit.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/test/sumo/build/cmake-build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o"
	cd /home/test/sumo/build/cmake-build/src/utils/traction_wire && /usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o -c /home/test/sumo/src/utils/traction_wire/Circuit.cpp

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/utils_traction_wire.dir/Circuit.cpp.i"
	cd /home/test/sumo/build/cmake-build/src/utils/traction_wire && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/test/sumo/src/utils/traction_wire/Circuit.cpp > CMakeFiles/utils_traction_wire.dir/Circuit.cpp.i

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/utils_traction_wire.dir/Circuit.cpp.s"
	cd /home/test/sumo/build/cmake-build/src/utils/traction_wire && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/test/sumo/src/utils/traction_wire/Circuit.cpp -o CMakeFiles/utils_traction_wire.dir/Circuit.cpp.s

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o.requires:

.PHONY : src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o.requires

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o.provides: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o.requires
	$(MAKE) -f src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/build.make src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o.provides.build
.PHONY : src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o.provides

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o.provides.build: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o


src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/flags.make
src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o: ../../src/utils/traction_wire/Element.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/test/sumo/build/cmake-build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o"
	cd /home/test/sumo/build/cmake-build/src/utils/traction_wire && /usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/utils_traction_wire.dir/Element.cpp.o -c /home/test/sumo/src/utils/traction_wire/Element.cpp

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/utils_traction_wire.dir/Element.cpp.i"
	cd /home/test/sumo/build/cmake-build/src/utils/traction_wire && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/test/sumo/src/utils/traction_wire/Element.cpp > CMakeFiles/utils_traction_wire.dir/Element.cpp.i

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/utils_traction_wire.dir/Element.cpp.s"
	cd /home/test/sumo/build/cmake-build/src/utils/traction_wire && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/test/sumo/src/utils/traction_wire/Element.cpp -o CMakeFiles/utils_traction_wire.dir/Element.cpp.s

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o.requires:

.PHONY : src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o.requires

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o.provides: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o.requires
	$(MAKE) -f src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/build.make src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o.provides.build
.PHONY : src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o.provides

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o.provides.build: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o


src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/flags.make
src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o: ../../src/utils/traction_wire/Node.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/test/sumo/build/cmake-build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Building CXX object src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o"
	cd /home/test/sumo/build/cmake-build/src/utils/traction_wire && /usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/utils_traction_wire.dir/Node.cpp.o -c /home/test/sumo/src/utils/traction_wire/Node.cpp

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/utils_traction_wire.dir/Node.cpp.i"
	cd /home/test/sumo/build/cmake-build/src/utils/traction_wire && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/test/sumo/src/utils/traction_wire/Node.cpp > CMakeFiles/utils_traction_wire.dir/Node.cpp.i

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/utils_traction_wire.dir/Node.cpp.s"
	cd /home/test/sumo/build/cmake-build/src/utils/traction_wire && /usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/test/sumo/src/utils/traction_wire/Node.cpp -o CMakeFiles/utils_traction_wire.dir/Node.cpp.s

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o.requires:

.PHONY : src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o.requires

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o.provides: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o.requires
	$(MAKE) -f src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/build.make src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o.provides.build
.PHONY : src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o.provides

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o.provides.build: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o


# Object files for target utils_traction_wire
utils_traction_wire_OBJECTS = \
"CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o" \
"CMakeFiles/utils_traction_wire.dir/Element.cpp.o" \
"CMakeFiles/utils_traction_wire.dir/Node.cpp.o"

# External object files for target utils_traction_wire
utils_traction_wire_EXTERNAL_OBJECTS =

src/utils/traction_wire/libutils_traction_wire.a: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o
src/utils/traction_wire/libutils_traction_wire.a: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o
src/utils/traction_wire/libutils_traction_wire.a: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o
src/utils/traction_wire/libutils_traction_wire.a: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/build.make
src/utils/traction_wire/libutils_traction_wire.a: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/test/sumo/build/cmake-build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "Linking CXX static library libutils_traction_wire.a"
	cd /home/test/sumo/build/cmake-build/src/utils/traction_wire && $(CMAKE_COMMAND) -P CMakeFiles/utils_traction_wire.dir/cmake_clean_target.cmake
	cd /home/test/sumo/build/cmake-build/src/utils/traction_wire && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/utils_traction_wire.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/build: src/utils/traction_wire/libutils_traction_wire.a

.PHONY : src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/build

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/requires: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Circuit.cpp.o.requires
src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/requires: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Element.cpp.o.requires
src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/requires: src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/Node.cpp.o.requires

.PHONY : src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/requires

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/clean:
	cd /home/test/sumo/build/cmake-build/src/utils/traction_wire && $(CMAKE_COMMAND) -P CMakeFiles/utils_traction_wire.dir/cmake_clean.cmake
.PHONY : src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/clean

src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/depend:
	cd /home/test/sumo/build/cmake-build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/test/sumo /home/test/sumo/src/utils/traction_wire /home/test/sumo/build/cmake-build /home/test/sumo/build/cmake-build/src/utils/traction_wire /home/test/sumo/build/cmake-build/src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : src/utils/traction_wire/CMakeFiles/utils_traction_wire.dir/depend

