import os
import sys

def getPackage(path):
  lst = path.split('\\')
  res = ""
  for i in range(8, 13):
    res += (lst[i] + ".")
  fileWithEx = lst[-1]
  res += fileWithEx.split(r'.')[0]
  return res


if __name__ == '__main__':
  if len(sys.argv) != 2:
    print("No File Specified!")
    sys.exit()
  res = getPackage(sys.argv[1])
  cmd = "mvn test -Dtest=" + res + "#test -DskipTests=false"
  os.system(cmd)

