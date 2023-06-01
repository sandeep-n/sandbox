
import argparse
import distutils.util


def main():
    parser = argparse.ArgumentParser(description="simple boolean parser")
    parser.add_argument('--feature', dest='feature', type=lambda x:bool(distutils.util.strtobool(x)), default=True)
    args = parser.parse_args()
    print(args.feature)


if __name__ == '__main__':
    main()
