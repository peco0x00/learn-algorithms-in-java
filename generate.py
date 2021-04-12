import os
import sys

def getOutputFilePath(inputFilePath):
  lst = inputFilePath.split("\\")
  lst[6] = "test"
  folder = lst[:13]
  filenameList = lst[-1].split(r'.')
  fileBaseName = filenameList[0] + "Test"
  filename = filenameList[0] + "Test." + filenameList[1]
  lst[-1] = filename
  return '\\'.join(folder), fileBaseName, '\\'.join(lst)

def generate(inFull, outFull, problemFolder, outBaseName):
  f = open(inFull, 'r')
  if not os.path.exists(problemFolder):
    os.mkdir(problemFolder)
  outf = open(outFull, 'w')
  outf.write(f.readline())
  outf.write('\n')
  outf.write('import org.junit.Test;\n')
  outf.write('import static org.junit.Assert.*;\n')
  outf.write('\n')
  outf.write("public class " + outBaseName + "{\n")
  outf.write('\n')
  outf.write('\t@Test\n')
  outf.write('\tpublic void test() {\n')
  outf.write('\t\t\n')
  outf.write('\t}\n')
  outf.write('}\n')
  outf.close()
  f.close()

if __name__ == '__main__':
  if len(sys.argv) < 2:
    print("No File Specified!")
    sys.exit()
  folder, outBase, outPath = getOutputFilePath(sys.argv[1])
  generate(sys.argv[1], outPath, folder, outBase)

