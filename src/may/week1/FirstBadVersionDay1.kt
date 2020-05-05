package may.week1


fun firstBadVersion(n: Int): Int {
    //var version = n / 2
    //var firstBadVersion = 1

    var left = 1
    var right = n
    var mid =0


    while (left < right) {
       // mid = left + (right-left) / 2
        if (!isBadVersion(mid)) {
            left = mid+1
        } else {
            right = mid
        }

    }
    return left
}



//    if (isBadVersion(version)) {
//        // check if it is bad version
//        // in case of it is bad version so will go down until find good version
//        version--
//        while (!isBadVersion(version) ) {
//            if (version ==0)
//                break
//            version--
//        }
//        firstBadVersion = version
//
//    } else {
//        // check if it is not bad version
//        // in case of it is good version so will go up until find bad  version
//        ++version
//        while (!isBadVersion(version)) {
//            ++version
//        }
//        firstBadVersion = version
//    }
    //return firstBadVersion
//}

private fun isBadVersion(version: Int): Boolean {
    return version >= 4
}
