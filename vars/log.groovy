def call(String message, String facility) {
    RED='\033[0;31m'
    LIGHT_RED='\033[1;31m'
    BLUE='\033[0;34m'
    LIGHT_BLUE='\033[1;34m'
    CYAN='\033[0;36m'
    LIGHT_CYAN='\033[1;36m'
    GREEN='\033[0;32m'
    LIGHT_GREEN='\033[1;32m'
    PURPLE='\033[0;35m'
    LIGHT_PURPLE='\033[1;35m'
    BROWN='\033[0;33m'
    ON_YELLOW='\033[0;43m'
    GRAY='\033[0;30m'
    LIGHT_GRAY='\033[0;37m'
    NC='\033[0m'
    ansiColor('xterm') {
        switch (facility.toLowerCase()) {
        case 'info':
            echo "${BLUE} INFO: ${message}. ${NC}"
            break
        case 'debug':
            echo "${LIGHT_RED} DEBUG: ${message}. ${NC}"
            break
        case 'block':
            echo "========== ========== ========== ========== ========== ========== ========== ========== ========== ========== ========== =========="
            break        
        }
    }
