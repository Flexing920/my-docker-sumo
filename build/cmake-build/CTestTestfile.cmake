# CMake generated Testfile for 
# Source directory: /home/test/sumo
# Build directory: /home/test/sumo/build/cmake-build
# 
# This file includes the relevant testing commands required for 
# testing this directory and lists subdirectories to be tested as well.
add_test(exampletest "/usr/bin/python" "/home/test/sumo/docs/examples/runAll.py")
subdirs("src")
subdirs("unittest")
